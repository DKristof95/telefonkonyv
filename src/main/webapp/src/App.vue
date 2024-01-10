<template>
  <div id="app">
    <img alt="Quarkify logo" style="background: black; padding: 3vh; border-radius: 1vh" src="https://quarkify.net/wp-content/uploads/2020/05/quarkify_logo_site-1.png">
    <HelloWorld msg="Welcome to Your Vue.js App with Quarkus"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
