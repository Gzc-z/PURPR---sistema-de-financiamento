build:
	@javac -d bin $$(find -name "*.java")

run: build
	@java -cp bin main.Main
