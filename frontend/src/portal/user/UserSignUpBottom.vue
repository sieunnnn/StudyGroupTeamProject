
<template>
  <ModalFormA class="container_signup">
    <template #contents>
      <div class="wrapper_signup">
        <div :style="`margin-top: 35px`">
          <label>아이디</label><br>
          <input
            v-model="userId"
            type="text"
          >
        </div>
        <div>
          <label>비밀번호</label><br>
          <input
            v-model="userPw"
            type="text"
          >
        </div>
        <div>
          <label>이메일</label><br>
          <input
            v-model="userEmail"
            type="text"
          >
        </div>
        <div>
          <label>닉네임</label><br>
          <input
            v-model="userNickname"
            type="text"
          >
        </div>
        <div class="next_btn">
          <img src="../../assets/images/next_btn.png">
        </div>
      </div>
    </template>
  </ModalFormA>
</template>

<script>
import ModalFormA from "@/components/modal/ModalFormA";

export default {
  name: 'SignUp',

  components: {
    ModalFormA
  },

  data: function () {
    return {
      userId: '아이디를 입력해주세요.',
      userPw: '비밀번호를 입력해주세요.',
      userEmail: '이메일을 입력해주세요.',
      userNickname: '닉네임을 입력해주세요.'

    }
  }
}
</script>