package com.group7.unveil.data

import com.group7.unveil.landmarks.Landmarks

/**
 * @author M. Rose
 */
object LocationData {
    var locationPermission = false

    /**
     * The number of locations a user has visited
     */
    var locationsVisited = 0
        set(value) {
            require(value >= 0) { "Cannot have negative landmarks"}
            require(value <= Landmarks.size) { "Cannot have more landmarks than their are"}
            field = value
        }
}