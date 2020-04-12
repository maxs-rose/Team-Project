package com.group7.unveil.events

import com.group7.unveil.events.backend.SetEvent

/**
 * Event Bus using interfaces for updating things throughout the app
 * @author M. Rose
 */
object EventBus {
    val stepEvent = event<StepEventData>()
    val landmarkEvent = event<LandmarkEventData>()
}

/**
 * Method to create an event
 * @author M. Rose
 *
 * @sample
 * <code>
 * var exampleEventName = event<ExampleEventData>() // create the event
 *
 * exampleEventName += {(data : ExampleEventData) -> eventMethod(data) } // adding a listener to the event
 * exampleEventName -= {(data : ExampleEventData) -> eventMethod(data) } // removing a listener from the event
 *
 * exampleEventName(ExampleEventData()) // calling the event
 * </code>
 */
fun <T> event() = SetEvent<T>()