package com.ysd.redis;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

@Component
public final class RedisTrans {

	@Resource
	private StringRedisTemplate stringRedisTemplate;
    

	/**
	 * 写入缓存
	 *
	 * @param key
	 * @param object
	 * @return
	 */
	public boolean set(final String key, String object) {
		boolean result = false;
		try {
			// 通过set方法设置存储的内容(key,value,时间，时间的单位)
			stringRedisTemplate.setKeySerializer(new StringRedisSerializer());
			

			stringRedisTemplate.opsForValue().set(key, object, 6000, TimeUnit.SECONDS);

			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 得到缓存
	 *
	 * @param key
	 * @param value
	 * @return
	 */
	public String get(final String key) {
		String value = null;
		try {
			// 通过get方法获取存储的内容(key)
			value = stringRedisTemplate.opsForValue().get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	
	/**
	 * 鍒犻櫎/鍒ゆ柇锛堜慨鏀规澶勬殏涓嶅啓锛屽叾瀹炲氨鏄厛鍒犲啀瀛橈級
	 */
	/*
	 * // 鍒犻櫎key鍜屽搴旂殑value public void delete(String key) {
	 * redisTemplate.delete(key); }
	 * 
	 * // 鍒犻櫎澶氫釜key鍜屽搴旂殑value public void delete(List<String> keys) {
	 * redisTemplate.delete(keys); }
	 * 
	 * // 鍒ゆ柇鏄惁鍚玨ey public Boolean hasKey(String key) { return
	 * redisTemplate.hasKey(key); }
	 * 
	 * // String瀛樺偍 public void setString(String key, String str) {
	 * redisTemplate.opsForValue().set(key, str); }
	 * 
	 * // String瀛樺偍(璁剧疆澶辨晥) public void setStringAndTimeOut(String key, String str,
	 * Integer expise) { redisTemplate.opsForValue().set(key, str);
	 * redisTemplate.expire(key, expise, TimeUnit.SECONDS); }
	 * 
	 * // String鑾峰彇 public String getString(String key) { return
	 * redisTemplate.opsForValue().get(key).toString(); }
	 * 
	 * // List瀛樺偍 public void setList(String key, List value2) {
	 * redisTemplate.opsForList().leftPush(key, value2); }
	 * 
	 * // List瀛樺偍(璁剧疆澶辨晥) public void setListAndTimeOut(String key, List<Object>
	 * value2, Integer expise) { redisTemplate.opsForList().leftPush(key, value2);
	 * redisTemplate.expire(key, expise, TimeUnit.SECONDS); }
	 * 
	 * // List鑾峰彇
	 * 
	 * @SuppressWarnings("unchecked") public List<Object> getList(String key) {
	 * return (List<Object>) redisTemplate.opsForList().leftPop(key); }
	 * 
	 * // Map瀛樺偍 public void setMap(String key, Map<Object, Object> value3) {
	 * redisTemplate.opsForHash().putAll(key, value3); }
	 * 
	 * // Map瀛樺偍(璁剧疆澶辨晥) public void setMapAndTimeOut(String key, Map<Object,
	 * Object> value3, Integer expise) { redisTemplate.opsForHash().putAll(key,
	 * value3); redisTemplate.expire(key, expise, TimeUnit.SECONDS); }
	 * 
	 * // Map鑾峰彇 public Map<Object, Object> getMap(String key) { return
	 * redisTemplate.opsForHash().entries(key); }
	 * 
	 * // 鍙栨墍鏈塳ey public Set<Object> getMapKeys(String key) { return
	 * redisTemplate.opsForHash().keys(key); }
	 * 
	 * // 鍙栨墍鏈塿alue public List<Object> getMapValues(String key) { return
	 * redisTemplate.opsForHash().values(key); }
	 * 
	 * // 鍙栧搴擬ap瀵瑰簲key鍊� public Object getValueByMapKey(String map, String key) {
	 * return redisTemplate.opsForHash().get(map, key); }
	 * 
	 * // Set瀛樺偍 public void setSet(String key, Set<Object> set) {
	 * redisTemplate.opsForSet().add(key, set); }
	 * 
	 * // Set瀛樺偍(璁剧疆澶辨晥) public void setSetAndTimeOut(String key, Set<Object> set,
	 * Integer expise) { redisTemplate.opsForSet().add(key, set);
	 * redisTemplate.expire(key, expise, TimeUnit.SECONDS); }
	 * 
	 * // Set鑾峰彇 public Set<Object> getSet(String key) { return
	 * redisTemplate.opsForSet().members(key); }
	 */
}
