import ck.solo.RubType

class BootStrap {

    def init = { servletContext ->
        createSampleData()
    }
    def destroy = {
    }

    private createSampleData() {
        println "Creating sample data"

        def typeBook = new RubType( name: "Book").save(failOnError: true)
        def typeMovie = new RubType( name: "Movie").save(failOnError: true)
        def typeMusic = new RubType( name: "Music").save(failOnError: true)

    }
}
