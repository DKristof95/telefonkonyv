<template>
  <q-layout view="lHh Lpr lFf">
    <q-header elevated>
      <q-toolbar>
        <q-btn
          flat
          dense
          round
          icon="menu"
          aria-label="Menu"
          @click="toggleLeftDrawer"
        />

        <q-toolbar-title>
          Telefonkönyv
        </q-toolbar-title>

        <div>Quasar v{{ $q.version }}</div>
      </q-toolbar>
    </q-header>

    <q-drawer
      v-model="leftDrawerOpen"
      show-if-above
      bordered
    >
      <q-list>
        <q-item-label
          header
        >
          Menü
        </q-item-label>

        <EssentialLink
          v-for="menuPoint in menuPoints"
          :key="menuPoint.title"
          v-bind="menuPoint"
        />
      </q-list>
    </q-drawer>

    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>
import { defineComponent, ref } from 'vue'
import EssentialLink from 'components/MenuPoint.vue'

const menuPointsList = [
  {
    title: "Végpontok listázása",
    icon: "view_list",
    link: "https://quasar.dev",
  },
  {
    title: "Végpont keresése",
    caption: "Név vagy típus szerint",
    icon: "search",
    link: "https://github.com/quasarframework",
  },
  {
    title: "Új végpont hozzáadása",
    icon: "add_circle_outline",
    link: "https://chat.quasar.dev",
  },
  {
    title: "Végpont szerkesztése",
    icon: "edit",
    link: "https://forum.quasar.dev",
  },
  {
    title: "Végpont törlése",
    icon: "delete",
    link: "https://twitter.quasar.dev",
  }
]

export default defineComponent({
  name: 'MainLayout',

  components: {
    EssentialLink
  },

  setup () {
    const leftDrawerOpen = ref(false)

    return {
      menuPoints: menuPointsList,
      leftDrawerOpen,
      toggleLeftDrawer () {
        leftDrawerOpen.value = !leftDrawerOpen.value
      }
    }
  }
})
</script>
