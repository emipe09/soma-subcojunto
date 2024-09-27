JAVAC = javac
JAVA = java

BIN_DIR = bin
SRC_DIR = src

SOURCES = $(SRC_DIR)/Main.java $(SRC_DIR)/Conjunto.java
CLASSES = $(BIN_DIR)/Main.class $(BIN_DIR)/Conjunto.class

# Compila todas as classes
all: $(CLASSES)

# Executa o programa
run: all
	$(JAVA) -cp $(BIN_DIR) Main

# Regra para compilar os arquivos .java em .class
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

# Limpa os arquivos compilados
clean:
	rm -rf $(BIN_DIR)/*.class
