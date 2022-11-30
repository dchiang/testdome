# [Cache Casting](https://www.testdome.com/questions/java/cache-casting/54678 "Cache Casting")

A company is designing the class hierarchy for various cache implementations:

```java
public class Cache {}

public class DiskCache extends Cache {}

public class MemoryCache extends Cache {}

public class OptimizedDiskCache extends DiskCache {}
```

**Select all the answers that will result in a runtime exception.** (Select all acceptable answers.)

<table border="0">
 <tr>
    <td><input type="checkbox" onClick="return false" ></td>
    <td>

```java
OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
Cache cache = (Cache) optimizedDiskCache;
```

   </td>
 </tr>
 <tr>
   <td><input type="checkbox" onClick="return false" checked></td>
   <td>

```java
MemoryCache memoryCache = new MemoryCache();
Cache cache = (Cache) memoryCache;
DiskCache diskCache = (DiskCache) cache;
```

   </td>
 </tr>
 <tr>
   <td><input type="checkbox" onClick="return false" checked></td>
   <td>

```java
DiskCache diskCache = new DiskCache();
OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;
```

   </td>
 </tr>
 <tr>
    <td><input type="checkbox" onClick="return false" ></td>
    <td>

```java
OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
DiskCache diskCache = (DiskCache) optimizedDiskCache;
```

   </td>
 </tr>
 <tr>
   <td><input type="checkbox" onClick="return false" checked></td>
   <td>

```java
Cache cache = new Cache();
MemoryCache memoryCache = (MemoryCache) cache;
```

   </td>
 </tr>
 <tr>
    <td><input type="checkbox" onClick="return false" ></td>
    <td>

```java
OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
Cache cache = (Cache) optimizedDiskCache;
DiskCache diskCache = (DiskCache) cache;
```

   </td>
 </tr>
</table>