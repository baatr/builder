package dbo2iib.iib

class Application {
    String name
    String path
    String[] dependencies

    Application(name, path, dependencies) {
        this.name = name
        this.path = path
        this.dependencies = dependencies
    }
}
