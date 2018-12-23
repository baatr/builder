package dbo2iib

class Component {
    String name
    Subsystem[] subsystems
    String[] tests

    Component(name, subs, tests) {
        this.name = name
        this.subsystems = subs
        this.tests = tests
    }
}
