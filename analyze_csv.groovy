@Grab(group='com.opencsv', module='opencsv', version='5.7.1')

import com.opencsv.CSVReader
import com.opencsv.CSVReaderBuilder

def readCSV(filePath) {
    def reader = new CSVReaderBuilder(new FileReader(filePath)).build()
    def allRows = reader.readAll()
    reader.close()
    return allRows
}

def analyzeCSV(data) {
    def numberOfRows = data.size()
    def numberOfColumns = data[0].size()
    def firstRows = data.take(5)
    
    println "Number of rows: $numberOfRows"
    println "Number of columns: $numberOfColumns"
    println "First few rows:"
    firstRows.each { row ->
        println row.join(", ")
    }
}

def csvFilePath = args[0] // Path to CSV file passed as a command-line argument
def data = readCSV(csvFilePath)
analyzeCSV(data)
