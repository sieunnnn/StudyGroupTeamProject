import {defineStore} from "pinia";

// interface notice {
//     notice_idx: Number;
//     notice: String;
//     content: String;
// }


export const useCounterStore = defineStore("noticeStore",{
   

    state: () => ({ count: 0 }),
    actions:{
        increment(value=1){
            this.count+=value;
        },
    },

    getters:{
        returnNoticeList(state){
            return state.noticelist;
        }
    }


});