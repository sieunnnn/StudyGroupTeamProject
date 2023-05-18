import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import { router } from '@/router'
import store from '@/store/signup'

const pinia = createPinia()

createApp(App)
    .use(router)
    .use(store)
    .use(pinia)
    .mount('#app')

