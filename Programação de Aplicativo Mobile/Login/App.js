import { StatusBar } from 'expo-status-bar';
import { Picker } from '@react-native-picker/picker';
import Checkbox from 'expo-checkbox';
import { StyleSheet, Text, View, Image,} from 'react-native';
import { TextInput } from 'react-native-web';
export default function App() {
  return (
    <View style={styles.container}>

      
      
      <View style={styles.fotoPerfil}>
        
        <Image 
          style={styles.foto}
          source={require("./assets/gato.jpeg")}
        /> 
            
      </View>

      <View style={styles.dadosPessoais}>
          <Text style={styles.titulo}> Dados Pessoais </Text>
          <TextInput
            style={styles.dados}
            placeholder='Digite seu nome'
          />

          <TextInput
            style={styles.dados}
            placeholder='Digite seu telefone'
            keyboardType='numeric'
          />

          <TextInput
            style={styles.dados}
            placeholder='Digite seu endereço'
          />

          <TextInput
            style={styles.dados}
            placeholder='Digite seu e-mail'
          />
      </View>

      <View style={styles.outrasInfo}>
        <Text style={styles.titulo}>Outras informações</Text>

        <Picker style={styles.label}>
          <Picker.Item label="Java" value="Java"/>
          <Picker.Item label="JavaScript" value="JavaScipt"/>
          <Picker.Item label="Python" value="Python"/>
          <Picker.Item label="Php" value="Php"/>
          <Picker.Item label="C++" value="C++"/>
        </Picker>

        <View style={styles.quadradocheck}>

          <Checkbox style={styles.checkbox}>
            value={true}
          </Checkbox>

          <Text style={styles.textcheck}>Aceita os termos de serviço</Text>

        </View>
      </View>

      <View style={styles.respostas}>
        <Text style={styles.titulo}>Nome:</Text>

        <Text style={styles.titulo}>Telefone:</Text>

        <Text style={styles.titulo}>Endereço:</Text>

        <Text style={styles.titulo}>Email:</Text>

        <Text style={styles.titulo}>Hobby:</Text>

        <Text style={styles.titulo}>Aceito:</Text>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexDirection:'column',
    flex: 5,
    justifyContent: 'center',
    alignItems: 'center',
  },

  foto: { 
    width: 180,
    height: 180,
    borderRadius: 100,
    marginBottom: 30,
  },

  dadosPessoais: {
    width: 410,
    padding: 15,
    borderRadius: 15,
    borderWidth: 1,
    alignItems: 'center',
    marginBottom: 10,
  },

  dados: {
    width: 380,
    padding: 14,
    borderRadius: 10,
    marginBottom: 5,
    color: 'grey',
    borderWidth: 1,
  },
  
  outrasInfo: {
    width: 410,
    padding: 14,
    borderRadius: 10,
    marginBottom: 5,
    marginTop: 10,
    borderWidth: 1,
  },

  respostas: {
    width: 410,
    padding: 14,
    borderRadius: 10,
    marginTop:10,
    marginTop: 10,
    borderWidth: 1,
  },

  titulo: {
    alignSelf: 'flex-start',
    fontSize: 18,
    marginBottom: 15,
  },

  textInput: {
    width: '100%',
    borderWidth: 1,
    padding: 12,
    marginBottom: 15,
    borderRadius: 10,
  },

  label: {
    padding:2,
    marginBottom:5,
  },

  quadradocheck: {
    flexDirection: 'row',
  },

  checkbox: {
    padding: 2,
  },

  textcheck: {
    left: '2%',
  },
});