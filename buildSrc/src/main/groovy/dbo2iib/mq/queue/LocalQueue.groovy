package dbo2iib.mq.queue

class LocalQueue implements Queue {
    String name, boname, description

    LocalQueue(name, boname, description) {
        this.name = name
        this.boname = boname
        this.description = description
    }

    String generate() {
        return "DEFINE QLOCAL(" + name + ") BOQNAME(" + boname + ") MAXDEPTH(" + MAX_DEPTH + ") MAXMSGL(" + MAX_MSGL + ") DESCR('" + description + "') NOREPLACE"
    }
}
