package dbo2iib.mq.queue

class RemoteQueue implements Queue {
    String name, rname, rqmname, description, tqname

    RemoteQueue(name, rname, rqmname, description, tqname) {
        this.name = name
        this.rname = rname
        this.rqmname = rqmname
        this.description = description
        this.tqname = tqname
    }

    String generate() {
        return "DEFINE QREMOTE(" + name + ") RQMNAME(" + rqmname + ") RNAME(" + rname + ") XMITQ(" + tqname + ") DESCR('" + description + "') REPLACE"
    }
}
