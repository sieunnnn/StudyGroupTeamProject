const notice = [
   
    {
        path: '/notice',
        component: () => import('@/portal/frame/NintendoScreen'),
        children:[
            {
                path: "noticeWrite",
                component: () => import('@/portal/notice/noticeWrite'),
            }
        ]

    }

]
export { notice }