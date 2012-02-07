package com.dumpling.core

import spock.lang.Specification
import com.dumling.util.StringUtil

/**
 *
 * Created by: magnus
 *
 */
class DumplingSpockTest extends Specification {


    /*def "Handling nasty static collaborator call"() {
        StringUtil.metaClass.static.concatDumplingStyle = {String arg1, String arg2 ->
            println "WHAT"
            def result = 'MOCK'
        }


        setup:
        println "Setup " + StringUtil.concatDumplingStyle("Mamma", "Pappa")

        expect:
        dumpling.toString() == "|Jalla|Dalla||"

        where:
        dumpling = new Dumpling("Jalla", "Dalla")
    } */

}
