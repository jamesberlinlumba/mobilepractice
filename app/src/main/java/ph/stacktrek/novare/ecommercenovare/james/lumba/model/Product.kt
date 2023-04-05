package ph.stacktrek.novare.ecommercenovare.james.lumba.model

import java.math.BigDecimal

class Product(var name: String, var description : String) {
    lateinit var id: String
    lateinit var price: BigDecimal
    lateinit var brand: String
    lateinit var measurement: String
    var measurementUnit: MeasurementUnit = MeasurementUnit.NOT_SET
    var quantity: Int = 0
}

enum class MeasurementUnit{
    KILOGRAMS,
    GRAMS,
    METER,
    TONS,
    NOT_SET
}

