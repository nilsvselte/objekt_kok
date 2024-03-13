


def tell_ned(tall:int) -> int:
    return tall - 1


tall = 6
tall = tell_ned(tall)
print(tall)
tall = tell_ned(tall)
print(tall)
tall = tell_ned(tall)
print(tall)
tall = tell_ned(tall)
print(tall)

# Her viser jeg hvordan typesjekking kan innføres i Python også:
# Det er derimot lov til å kjøre filen, og den vil kjøre helt til en kommer til den linjen.
tall = tell_ned("ost") # https://www.emmanuelgautier.com/blog/enable-vscode-python-type-checking

# Disse funksjonene har ingen kontekst.
# Sett at du har noe som skal løses i en helt bestemt omgivelse.
# Hva hvis jeg vil telle ned flere ulike ting på en gang?
# Hva er beste måten å lage flere slike tellere?
