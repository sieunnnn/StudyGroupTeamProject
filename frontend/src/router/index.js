import {createRouter, createWebHistory} from 'vue-router'
import { userPages } from '@/router/user-pages'
import { notice } from '@/router/notice'

const routes = [
    ...userPages,
    ...notice
]

// 라우터 생성
const router = createRouter({
    history: createWebHistory(),
    routes
})

// 라우터 추출
export { router }