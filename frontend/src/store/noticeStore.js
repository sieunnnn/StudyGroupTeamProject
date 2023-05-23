import axios from "axios";
import { defineStore } from "pinia";

export const useNoticeStore=defineStore("noticeStore",{
    id:"noticeStore",
    state:()=>({
        notice:"",
        content:"",
    }),
    getters:{

    },
    actions:{
        async fetchReceiveNoticeList(){
            return axios.get('api/notice/AllNotice',this.notice)
        },
        async noticeWrite(){
            axios.post('api/notice/newNotice',JSON.stringify(this.$state))
        }
    }
})
