package myapp.gradle

import dbo2iib.mq.channel.Sender
import dbo2iib.mq.queue.*
import dbo2iib.mq.channel.Channel

class IIBMQBuilderClass {
    String comps_string
    String name = "iibBuilder say getName"

    String getName() {
        return name
    }

    IIBMQBuilderClass(components) {
        this.comps_string = components
    }

    void initiateComponents() {
        Queue tq = new TransmitQueue("TOMBNK.TQ", "TOMBNK.CH")
        Channel test_sdr = new Sender("TOMBNK.CH", "host:port", tq)
        println test_sdr.generate()
        //gather data from yamls for each component


    }
}
