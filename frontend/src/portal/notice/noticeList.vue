<template>
  <noticeLists>
    <template #contents>
      <div class="noticeListHead">
        공지사항        
        <div
          v-for="notice in AllNotice"
          :key="notice"
          class="noticeLists"
        >
          {{ notice.content }}<hr>
        </div>
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
}
</script>

<style>
@import "../../assets/css/noticeList.css";
</style>