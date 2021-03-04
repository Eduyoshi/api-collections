package me.eduardo.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce{
    add, valor -> add + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()

