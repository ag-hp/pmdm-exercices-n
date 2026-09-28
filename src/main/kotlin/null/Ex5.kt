package org.ies.tierno.`null`

fun average(numbers: List<Double>): Double? =
    if (numbers.isEmpty())
        numbers.takeIf { it.isEmpty() } ?.average()
    else
        numbers.average()

// numbers.ifEmpty() { null } ?.average()