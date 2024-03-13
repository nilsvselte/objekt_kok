'''
En fryktelig forenklet spillkortklasse
Vi mangler alt en burde ha, som 
- Det er fire lovlige farger (suit)
- Det er fjorten lovlige verdier
- Fire av kortene har spesialtegn
- Verdi er avhengig av kortspill etc.

Poenget er uansett å vise at en 'ting' kan ha en del
egenskaper knyttet til SEG. Og som kan være ulike for
andre versjoner av 'tingen'. DET er en viktig del av
objektorientering.
'''

class Card:

    def __init__(self, type, verdi):
        self.suit = type
        self.verdi = verdi

    def __str__(self) -> str:
        return f'{self.suit} {self.verdi}'


kort1 = Card("S",12)
kort2 = Card("S",15) # 


print(kort1)
print(kort2)