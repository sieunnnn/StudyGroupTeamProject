import axios from "axios";
import { defineStore } from "pinia";

export const useNoticeStore=defineStore("noticeStore",{
    id:"noticeStore",
    state:()=>({
        noticeIdx:"",
        notice:"",
        content:"",
    }),
    getters:{
        getState:function(state) {
            console.dir(state)
            return state;
          }
        

    },
    actions:{
        async fetchReceiveNoticeList(){
            return axios.get('api/notice/AllNotice',this.notice)
        },
        async noticeWrite(){
            axios.post('api/notice/newNotice',JSON.stringify(this.$state))
        },
        async noticeUpdate(){
            axios.post('api/notice/noticeUpdate',JSON.stringify(this.$state))
        },
        async noticeDelete(){
            axios.post('api/notice/noticeDelete',JSON.stringify(this.noticeIdx))
        },

    }
})
