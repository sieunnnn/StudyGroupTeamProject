const userPages = [
    { path: '', redirect: '/main' },
    {
        path: '/main',
        component: () => import('@/portal/frame/NintendoScreen')

    }

]
export { userPages }