class TestingClass{

    def storage =[]

    def test(){
        def query = "cd /home/antonio && cat toni"
        def proc = [ "sh", "-c", query ]
        Process response = proc.execute()
        def lstx = response.text
        println(lstx)

//        def q = "echo -n '${lstx}'>>/home/antonio/proba"
        def q = "echo -n '${lstx}'  >>/home/antonio/proba"
        def procc = [ "sh", "-c", q ]
        Process responses = procc.execute()
    }


    def process() {
        File sourceFile = new File("engineScript.groovy");
        Class groovyClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(sourceFile);
        GroovyObject myObject = (GroovyObject) groovyClass.newInstance();
        def test = myObject.proba()
        println(test)
    }

    def collect(){
        String fileContents = new File('/home/antonio/out').text
        def q = "rm -rf /home/antonio/proba"
        def procc = [ "sh", "-c", q ]
        Process responses = procc.execute()
        println(fileContents)
    }

    def newTest(){
        def ktx = ["sqm-engine.link":"https://armengine", "os-tlp.hash":"64da13df07fc3078703e70f83cf75237c7315f45"]
        def q = "rm -rf out"
        def procc = [ "sh", "-c", q ].execute()
        File file = new File("out")
        file.append(ktx)

    }

    def readTest(){
        def fileContents = new File('out').text
        println(fileContents)
    }

    def shellWrite(){
        def ktx = "sqm-engine.link=https://arm.epk.ericsso, os-tlp.hash=64da13df07fc3078703e70f83cf75237c7315f45"
        def q = "cd /home/antonio/Desktop && echo '${ktx}'  >> proba"
        [ "bash", "-c", q ].execute()

    }

    def shellRead(){
        def query = "cd /home/antonio/Desktop && cat proba"
        def proc = [ "bash", "-c", query ]
        Process response = proc.execute()
        storage = response.text
        def queryDelete = "cd /home/antonio/Desktop && rm proba"
        [ "sh", "-c", queryDelete ].execute()
    }
}

def a = new TestingClass()


//a.test()
//a.newTest()
a.shellWrite()
a.shellRead()
println(a.storage)
//a.storage.each {k,v -> println "${k} ${v}"}
//def map = a.storage[0..-2].split(', ').collectEntries { entry ->
//                    def pair = entry.split('=')
//                    [(pair.first()): pair.last()]
//                }
//
//
//println(map)

//map.each {it->println "X[${it.key}XX,Y${it.value}]YY"}
//
//for (int i = 0; i < a.storage.size(); i += 2) {
//    linked.put(a.storage.get(i), a.storage.get(i + 1));
//}
//
//println(linked)