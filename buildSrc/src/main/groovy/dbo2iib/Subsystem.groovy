package dbo2iib

import dbo2iib.iib.Node
import dbo2iib.mq.Manager

class Subsystem {
    String[] names
    String[] tags
    Manager qm
    Node iib

    Subsystem(names, tags, qm, iib) {
        this.names = names
        this.tags = tags
        this.qm = qm
        this.iib = iib
    }
}
