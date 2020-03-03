//println(args)
def map = [
        'PARAMETER_ONE'  : 'test_1',
        'PARAMETER_TWO'  : 'test_2',
        'PARAMETER_THREE': 'test_3',
        'PARAMETER_FOUR' : 'test_4',
]

//map.each{ it -> println "${it.key},${it.value}" }
//
//map = toKeyValue(map)
//println(map)

//def newProps = new Properties()
//
//
//File propsFile = new File('test.properties')
//newProps.load(propsFile.newDataInputStream())
//
//newProps.withWriterAppend( 'UTF-8' ) { fileWriter ->
//    fileWriter.writeLine ''
//    map.each { key, value ->
//        fileWriter.writeLine "$key=$value"
//    }
//}

//def  pp = []
//Properties props = new Properties()
//File propsFile = new File('asd.properties')
//
//
//
//propsFile.load(new File("path/to/file.properties").newReader())
//propsFile.each {it->println("${it.key}")}

//pp.each{ it -> props.setProperty(it.key,it.value)}
//props.store(propsFile.newWriter(), null)
//propsFile.each {it->println("${it}")}
//println(propsFile)

//
//def props = new Properties()
//def stream = new FileInputStream("test.properties")
//try {
//    props.load(stream)
//} finally {
//    stream.close()
//}
//return props
//System.out.println(props)

class testingEnum{

    public static enum PackageNameLSV_18_1 {
        SYSTEM_PLATFORM('system-platform'),
        EA_APPLICATIONS('ea-applications'),
        SQM_APPLICATIONS('sqm-applications'),
        SQM_ENGINE('sqm-engine'),
        EEA_COMMON('eea-common'),
        OS_TLP('os-tlp'),
        ADMIN_NODE_TLP('eea-admin-node-components-tlp'),
        SYSTEM_PLATFORM_TLP('system-platform-tlp'),
        EA_APPLICATIONS_TLP('ea-applications-tlp'),
        SQM_APPLICATIONS_TLP('sqm-applications-tlp'),
        SQM_ENGINE_TLP('sqm-engine-tlp')

        String name

        PackageNameLSV_18_1(String name) {
            this.name = name
        }

        String toString() {
            return this.name
        }
    }
}

def test = []
def test1 = []
testingEnum.PackageNameLSV_18_1.values().each {it->
    test.add("'" + it + "'");
    test1.add("${it}".toUpperCase().replaceAll("-","_"));
}

println(test)
println(test1[0].getClass())

//def testing = testingEnum.PackageNameLSV_18_1.values().toString()
//def tes = "${testingEnum.PackageNameLSV_18_1.values()}"


//testingEnum.PackageNameLSV_18_1.values().each {it->test.add("'" + "${it}" + "'")}

//test = testingEnum.PackageNameLSV_18_1.values().each() {it.toUpperCase() -> println(it.name.toUpperCase())}
//def listOfPackages = []
//testingEnum.PackageNameLSV_18_1.values().each { cx -> listOfPackages.add("'" + "${cx}".toUpperCase() + "'") }
//listOfPackages.each {it->println(it)}
//def aa =  ['system-platform','ea-applications','sqm-applications','sqm-engine','eea-common','os-tlp','eea-admin-node-components-tlp','system-platform-tlp','ea-applications-tlp','sqm-applications-tlp','sqm-engine-tlp'] + "version"
//
//println(aa.collectEntries{[(it):it]+[(it+"test"):it]})

//
//aa=aa.collect{ "${it}.version" }.join(',')
//println(aa)
//listOfPackages.each{it->println "${it.('.version').toUpperCase()}"}
//listOfPackages.each{it->println "${it.minus('.version').toUpperCase()}"}

//testingEnum.PackageNameLSV_18_1.values().each { cx -> listOfPackages.add("${cx}".toUpperCase()) }
//listOfPackages.each {it->println it}
//Properties props = new Properties()
//File propsFile = new File("tst.properties")
//listOfPackages.each{ it -> props.setProperty(it.toUpperCase(),10)}
//props.store(propsFile.newWriter(), null)

//def listOfDownsteamPackages = []
//testingEnum.PackageNameLSV_18_1.values().each { cx -> listOfDownsteamPackages.add("${cx}".toUpperCase()) }
//
//println(listOfDownsteamPackages[0].getClass())

//Closure clearCluster() {
//    Properties propsGerritParameters = new Properties()
//    File propsFile = new File( "tst.properties" )
//    propsGerritParameters.load(propsFile.newDataInputStream())
//    return {
//        propsGerritParameters
//    }
//}
//
//test = clearCluster().call()
////
////
////println(System.getenv() )
////
////def listOfDownsteamPackages = []
////testingEnum.PackageNameLSV_18_1.values().each { cx -> listOfDownsteamPackages.add("${cx}".toUpperCase().replaceAll("-", "_").toString()) }
////println(listOfDownsteamPackages)
//
//def listOfDownstreamPackages = []
//def listOfPackages = []
//def listOfPackagesTest = []
//testingEnum.PackageNameLSV_18_1.values().each { cx ->
//    listOfPackages.add("'" + "${cx}" + "'");
//    if(cx.toString() == 'system-platform' || cx.toString() =='ea-applications') listOfPackagesTest.add("'" + "${cx}"+ ".version" + "'" );
//    listOfDownstreamPackages.add( "${ cx }".toUpperCase().toString().replaceAll("-", "_")) }
////
////listOfPackages.each {it->println(it.toUpperCase())}
//
////
//Properties props = new Properties()
//File propsFile = new File("tst.properties")
//Properties props1 = new Properties()
//File propsFile1 = new File("tst_one.properties")
////listOfPackages.each{ it -> props.setProperty(it.toUpperCase(),"10")}
////listOfPackagesTest.each{ it -> props1.setProperty(it.minus('.version')+ "_PREVIOUS","10")}
////props.store(propsFile.newWriter(), null)
////
////props1.store(propsFile1.newWriter(), null)
//println(props)

//
//Properties props = new Properties()
//props.load(new File("tst.properties").newReader())
//
//
//Properties props1 = new Properties()
//props1.load(new File("tst_one.properties").newReader())
//
//
//props1.putAll(props)
//
//println(props1)