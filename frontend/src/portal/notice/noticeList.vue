<template>
  <noticeLists>
    <template #contents>
      <div class="noticeListHead">
        공지사항        
        <div class="noticeLists">
          1. 공부 열심히 하자! 6월까지 화이팅하자!
        </div>
        <hr>
        <div class="noticeLists">
          2. 6월달에 SQLD 합격하자!
        </div>
      </div>
    </template>
  </noticeLists>
</template>

<script>
import noticeLists from '../../components/modal/ModalFormA.vue'

export default {
    name: 'NoticeList',
    components: {
    noticeLists
  }
}
</script>

<style>
@import "../../assets/css/noticeList.css";
</style>