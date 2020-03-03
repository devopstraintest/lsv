import groovy.transform.Field
println("************")
//println(args)

@Field final String PARAMETER_ONE = 'PARAMETER_ONE'
@Field final String PARAMETER_TWO = 'PARAMETER_TWO'
@Field final String PARAMETER_THREE = 'PARAMETER_THREE'
@Field final String PARAMETER_FOUR = 'PARAMETER_FOUR'


class ElasticSearchApiImplModified {
    def map = [
            ('PARAMETER_ONE'):'test_1',
            ('PARAMETER_TWO'):'test_2',
            ('PARAMETER_THREE'):'test_3',
            ('PARAMETER_FOUR'):'test_4',
    ]

    def k = []

    def test(){
        return this.map
    }

    Closure collect(){
        return {
            this.k = this.map
        }
    }


}

def particualarPackages = new ElasticSearchApiImplModified()
//println(particualarPackages.test())

//with particualarPackages.collect().each {it.delegate.properties.each {k -> println "${k.key} ${k.value}"}}

//with particualarPackages.collect().each {it-> println "${it.delegate.properties.key} ${it.delegate.properties.value}"}
with particualarPackages.collect()

particualarPackages.k.each {k, v -> println "${k} ${v}"}

//map.put(PARAMETER_ONE, hashmap.get(key) + 1);
//
//map.each{ k, v -> println "${k}:${v}" }

//a = [PARAMETER_ONE,PARAMETER_TWO]
//b = map.keySet().retainAll(a)
//System.out.println(b)
//
//
//println("DONE")

