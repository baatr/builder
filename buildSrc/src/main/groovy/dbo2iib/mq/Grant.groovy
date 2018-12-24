package dbo2iib.mq

class Grant {
    String qmname
    String type
    String object
    String[] rights

    Grant(qmname, type, object, rights) {
        this.qmname = qmname
        this.type = type
        this.object = object
        this.rights = rights
    }

    String generate() {
        return "setmqaut -m " + qmname + " -t qmgr " + (type.equals("user") ? "-p" : "-g") + " " + object + " " + rights.join(" ")
    }
}
