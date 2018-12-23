package myapp.gradle

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
        //gather data from yamls for each component


    }
}
