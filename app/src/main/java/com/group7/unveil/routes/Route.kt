package com.group7.unveil.routes

import com.google.android.gms.maps.model.LatLng
import com.group7.unveil.landmarks.Landmark

/**
 * Contains a route for the app consisting of a list of landmarks
 * @author M. Rose
 */
data class Route(val landmarks: List<Landmark>, val description: String) {
    fun getFirst() = landmarks.first()
    fun getLast() = landmarks.last()
    fun getSize() = landmarks.size

    fun getStartPos(): LatLng {
        return landmarks[0].getLatLong()
    }

    /**
     * Creates a name for a given route
     */
    fun getName(): String =
        "${getFirst().name} -> ${getLast().name}${landmarks.size.takeIf { it > 2 }
            ?.let { " (via ${landmarks[getSize() / 2].name})" }
            ?: ""}"

}

