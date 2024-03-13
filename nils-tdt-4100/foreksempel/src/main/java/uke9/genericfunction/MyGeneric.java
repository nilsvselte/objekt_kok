package uke9.genericfunction;

/**
 * Eksempel på hvordan man kan bruke generics. Interfacet MyGeneric<T>
 * har ikke spesifisert hva slags type den returnerer. Men, den sier
 * at objektet som skal returneres skal være av samme type som objektet
 * som sendes inn som parameter. Det betyr at hvis den skal returnere en
 * String, da må den også få en String inn. 
 */

public interface MyGeneric<T> {
    T compute(T t);
}


