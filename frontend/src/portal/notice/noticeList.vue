<template>
  <noticeLists>
    <template #contents>
      <div class="noticeListHead">
        공지사항  
        <hr>      
        <a 
          v-for="notice in AllNotice"
          :key="notice"
          class="noticeLists" @click="getNotice(notice)">
          {{ notice.content }}<hr>
        </a>
      </div>
    </template>
  </noticeLists>
</template>

<script>
import noticeLists from '../../components/modal/ModalFormA.vue'
import { useNoticeStore } from "@/store/noticeStore";

export default {
    name: 'NoticeList',
    components: {
    noticeLists
  },
  setup() {
    const noticeStore = useNoticeStore();
    return {
      noticeStore
    }
  },
  data:function(){
    return{
      test:"",
      AllNotice:""
    }
  },
  beforeCreate() {
    console.dir("beforeCreate");
     this.test= this.noticeStore.fetchReceiveNoticeList();
      this.test.then(async (result)=>{
       this.AllNotice= await result.data;
      })
  },
  methods:{
    getNotice(notice){
      this.$router.push('/notice/noticeUpdate')
      console.dir(notice)
    }
  }
}
</script>

<style>
@import "../../assets/css/noticeList.css";
</style>