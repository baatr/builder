package dbo2iib.iib

class MsgFlow {
    String name
    String path
    String[] dependencies

    MsgFlow(name, path, dependencies) {
        this.name = name
        this.path = path
        this.dependencies = dependencies
    }
}
