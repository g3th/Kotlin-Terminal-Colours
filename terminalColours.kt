fun main(){
	//38;5;ColourValue + m
	val titleLines = listOf(" ██████╗ ██████╗ ██╗      ██████╗ ██╗   ██╗██████╗     ███╗   ███╗███████╗         ","██╔════╝██╔═══██╗██║     ██╔═══██╗██║   ██║██╔══██╗    ████╗ ████║██╔════╝         ","██║     ██║   ██║██║     ██║   ██║██║   ██║██████╔╝    ██╔████╔██║█████╗           ","██║     ██║   ██║██║     ██║   ██║██║   ██║██╔══██╗    ██║╚██╔╝██║██╔══╝           ","╚██████╗╚██████╔╝███████╗╚██████╔╝╚██████╔╝██║  ██║    ██║ ╚═╝ ██║███████╗██╗██╗██╗"," ╚═════╝ ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝╚═╝╚═╝")
	val escapeSequence:String = "${27.toChar()}[38;5;"
	var counter = 0
	val colourRange = (30..300)
	for (j in colourRange){
		if(counter > titleLines.size-1){
			counter = 0
		}
		println("${escapeSequence}${colourRange.random()}m${titleLines[counter]}")
		counter++
	}
}
