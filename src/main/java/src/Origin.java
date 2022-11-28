package src;

public enum Origin {
    FRANCAIS(18),
    ESPAGNOL(18),
    ARGENTIN(18),
    TUNISIEN(18),
    AMERICAIN(21),
    JAPONAIS(20);

    int ageAdulte;

    Origin(int ageAdulte) { this.ageAdulte = ageAdulte; }
}
