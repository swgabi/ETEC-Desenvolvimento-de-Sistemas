import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Pressable, Image } from 'react-native';
import React, { useState } from 'react';

export default function App() {

const [jogador, setJogador] = useState(0)
const [maquina, setMaquina] = useState(0)

const [imagens, setImagens] = useState (
  [
    require("./assets/pontoInterrogacao.png"),
    require("./assets/Pedra.png"),
    require("./assets/Papel.png"),
    require("./assets/Tesoura.png")
  ]
)

const [jogadorImg, setJogadorImg] = useState(0)
const [maquinaImg, setMaquinaImg] = useState(0)

const pedra =()=>{
  setJogadorImg(1)

  const valorMaquina = Math.floor (Math.random() * 3) + 1

  setMaquinaImg (valorMaquina)

  if (valorMaquina == 3) {
    setJogador (jogador + 1)
  }else if (valorMaquina == 1) {
    setMaquina (maquina)
  } else {
    setMaquina (maquina + 1)
  }
} 

const papel =()=>{
  setJogadorImg(2)

  const valorMaquina = Math.floor (Math.random() * 3) + 1

  setMaquinaImg (valorMaquina)

  if (valorMaquina == 1) {
    setJogador (jogador + 1)
  }else if (valorMaquina == 2) {
    setMaquina (maquina)
  } else {
    setMaquina (maquina + 1)
  }
} 

const tesoura =()=>{
  setJogadorImg(3)

  const valorMaquina = Math.floor (Math.random() * 3) + 1

  setMaquinaImg (valorMaquina)

  if (valorMaquina == 2) {
    setJogador (jogador + 1)
  }else  if (valorMaquina == 3){
    setMaquina (maquina)
  }else {
    setMaquina (maquina + 1)
  }
} 

const reiniciar =()=>{
  setJogador(0)
  setMaquina(0)
  setJogadorImg(0)
  setMaquinaImg(0)
} 


  return (

    <View style={styles.container}>

      <View>
        <Image
            style={styles.logo}
            source={require("./assets/logoJoKenPo.png")}
        />
      </View>

      <View>
        <Text style={styles.placar}> 
          Placar
        </Text>
      </View>

      <View style={styles.numPlacar}> 
        <Text style={styles.numeros}> {jogador} </Text>
        <Text style={styles.numeros}> {maquina} </Text>
      </View>

      <View style={styles.opcoes}>
        <Image
          style={styles.interrogacao}
          source={imagens[jogadorImg]}
        />
        <Image
          style={styles.vs}
          source={require("./assets/vs.png")}
        />
        <Image
          style={styles.interrogacao}
          source={imagens[maquinaImg]}
        />
      </View>

      <View>
        <Pressable style={styles.botao} onPress={() => reiniciar()}>
          <Text style={styles.txtBotao}> Novo Jogo! </Text>
        </Pressable>
      </View>

      <View style={styles.maozinhas}>
        <Pressable onPress={() => pedra()}>
          <Image
            style={styles.mao}
            source={require("./assets/Pedra.png")}
          />
        </Pressable>
        
        <Pressable onPress={() => papel()}>
          <Image
            style={styles.mao}
            source={require("./assets/Papel.png")}
          />
        </Pressable>
        
        <Pressable onPress={() => tesoura()}>
          <Image
            style={styles.mao}
            source={require("./assets/Tesoura.png")}
          />
        </Pressable>
    
      </View>


      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    padding: 5,
    fontFamily: 'serif',
  },

  logo: {
    width: 380,
    height: 100,
    top: 30,
  },

  placar: {
    fontSize: 50,
    color: "#FFB1E1",
    top: 50,
    fontFamily: "fantasy",
  },

  numPlacar: {
    flexDirection: "row",
    justifyContent: "space-between",
    gap: 200,
    top: 80,
  },

  numeros: {
    fontSize: 50,
    color: "#FFB1E1",

    fontFamily: "fantasy",
  },

  opcoes: {
    flexDirection:"row",
    top: 30,
    gap: 15,
  },

  interrogacao: {
    top: 100,
    width: 150,
    height: 150,
  },

  vs: {
    top: 140,
    width: 90,
    height: 90,
  },

  botao: {
    top: 200,
    backgroundColor: "#FFB1E1",
    borderColor: "#FF66C4",
    borderWidth: 4,
    borderRadius: 40,
    width: 300,
    height: 80,
  },

  txtBotao: {
    margin: "auto",
    color: "#FF66C4",
    fontSize: 30,
    fontFamily: "fantasy",
  },

  maozinhas: {
    flexDirection:"row",
    top: 265,
  },

  mao: {
    width: 130,
    height: 130,
  },
  
});
