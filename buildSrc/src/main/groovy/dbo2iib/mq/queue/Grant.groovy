package dbo2iib.mq.queue

class Grant {
    String qmname
    String qname
    String type
    String object
    String[] rights

    Grant(qmname, qname, type, object, rights) {
        this.qmname = qmname
        this.qname = qname
        this.type = type
        this.object = object
        this.rights = rights
    }

    String[] generate() {
        return "setmqaut -m " + qmname + " -n " + qname + " -t queue " + (type.equals("user") ? "-p" : "-g") + " " + object + " " + rights.join(" ")
    }
}
