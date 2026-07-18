package wizardsandwarriors;

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    private boolean vulnerability = true;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return vulnerability;
    }

    public void prepareSpell() {
        vulnerability = false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return isVulnerable() ? 3 : 12;
    }
}
