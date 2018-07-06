// def beatles = ["John","Paul","George","Ringo"]
// for (int i = 0; i < beatles.size(); i++) {
//     def greeting = "Hello, "
//     println "$greeting" + "${beatles[i]}"
//     println '${i*10}'
// } 

def beatles = ['John', 'Paul', 'George', 'Ringo']
for (beatle in beatles){
    def greeting = "Hello, "
    println "$greeting" + "$beatle"
}
    
