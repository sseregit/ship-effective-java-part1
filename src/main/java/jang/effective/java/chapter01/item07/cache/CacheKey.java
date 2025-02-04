package jang.effective.java.chapter01.item07.cache;

import java.time.LocalDateTime;
import java.util.Objects;

public class CacheKey {

    private Integer value;
    private LocalDateTime created;

    public CacheKey(Integer value) {
        this.value = value;
        this.created = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CacheKey cacheKey = (CacheKey) o;
        return Objects.equals(value, cacheKey.value) && Objects.equals(created, cacheKey.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, created);
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "CacheKey{" +
                "value=" + value +
                ", created=" + created +
                '}';
    }
}
