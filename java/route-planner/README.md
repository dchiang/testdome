# [Route Planner](https://www.testdome.com/questions/java/route-planner/88759 "Route Planner")

As a part of the route planner, the routeExists method is used as a quick filter if the destination is reachable, before using more computationally intensive procedures for finding the optimal route.

The roads on the map are rasterized and produce a matrix of boolean values - true if the road is present or false if it is not. The roads in the matrix are connected only if the road is immediately left, right, below or above it.

Finish the routeExists method so that it returns true if the destination is reachable or false if it is not. The fromRow and fromColumn parameters are the starting row and column in the mapMatrix. The toRow and toColumn are the destination row and column in the mapMatrix. The mapMatrix parameter is the above mentioned matrix produced from the map.

For example, for the given rasterized map, the code below should return true since the destination is reachable:

    [   ROAD   ][ NOT ROAD ][ NOT ROAD ]
    [   ROAD   ][   ROAD   ][ NOT ROAD ]
    [ NOT ROAD ][   ROAD   ][   ROAD   ]

```java
boolean[][] mapMatrix = {
    {true,  false, false},
    {true,  true,  false},
    {false, true,  true}
};

routeExists(0, 0, 2, 2, mapMatrix);
```

<ins>

*Note: The solution for this question was copy as is from this [stackoverflow answer](https://stackoverflow.com/a/71298702/11915580 "Route planner two dimensional array") posted by [Vikas Kumar](https://stackoverflow.com/users/621359/vikas-kumar "Vikas Kumar")*

<ins>