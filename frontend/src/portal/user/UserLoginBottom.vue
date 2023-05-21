
<template>
  <div class="container_login">
    <div class="modal_login">
      <form @submit.prevent="submitLoginForm" class="wrapper_login">
        <div>
          <label>아이디</label><br>
          <input
            v-model="userId"
            type="text"
          >
        </div>
        <div :style="`margin-bottom: 10px`">
          <label>비밀번호</label><br>
          <input
            v-model="userPw"
            type="text"
          >
        </div>
        <button>
          <span :style="`margin-top:2px`">로그인</span>
        </button>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Login',

  data: function () {
    return {
      userId: '아이디를 입력해주세요.',
      userPw: '비밀번호를 입력해주세요.'
    }
  },

  methods: {
    submitLoginForm() {
      console.log('전송완료');
    }
  }
}
</script>