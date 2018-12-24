package dbo2iib.iib

class Library {
    String name
    String path
    String[] dependencies

    Library(name, path, dependencies) {
        this.name = name
        this.path = path
        this.dependencies = dependencies
    }
}
