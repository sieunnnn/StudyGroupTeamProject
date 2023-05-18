
<template>
  <Allnotice />
  <!-- <UserMain/> -->
</template>


<script>
import Allnotice from '@/portal/notice/notice.vue';
import UserMain from '@/portal/user/UserMain'
// import UserSignup from '@/portal/user/UserLoginTop'

export default {
  name: 'NintendoTopFrame',
  components: {
    Allnotice,
    UserMain
    // UserSignup
  }
}
</script>