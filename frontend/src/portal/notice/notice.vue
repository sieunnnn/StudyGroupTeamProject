<!-- eslint-disable vue/multi-word-component-names -->
<template>
  <div>
    <div
      class="allNotice"
      @click="closeNoticeList"
    >
      <div>
        <img
          class="npc3"
          src="../../assets/images/npc3_big.png"
        >
      </div>
      <div>
        <img
          class="noticeList"
          src="../../assets/images/notice_btn.png"
          @click="showNoticeList"
        >
      </div>
      <noticeLists v-if="isListOpen">
        <label>리스트 보여주기</label>
      </noticeLists>
      <div>
        <input
          v-model="counter.count"
          type="text"
        >
      </div>
    </div>
  </div>
</template>

<script>
import noticeLists from './noticeList.vue';
import axios from 'axios';
import {useCounterStore} from '@/stores/counter';

export default {


    name: 'AllNotice',
    components:{
        noticeLists
    },
   setup(){
      const counter = useCounterStore();
      return{
        counter : counter
      } 
    },
 
    data:function(){
        return {
            isListOpen:false
        }
    },
    methods: {
        showNoticeList(){
            setTimeout(()=> this.isListOpen=true,10);
            axios.get('/api/notice/selectNotice')
            .then(res => {
              this.apiRes = res.data;
              console.dir(this.apiRes);
            })            
            
        },
        closeNoticeList(){
            if(this.isListOpen==true) this.isListOpen=false;
            console.dir("닫기")
        }
    },
      
}
</script>

<style>
@import "../../assets/css/allNotice.css";
</style>