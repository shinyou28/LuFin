import { Checkbox as MuiCheckbox, CheckboxProps as MuiCheckboxProps } from '@mui/material';
import { styled } from '@mui/material/styles';
import React from 'react';

interface CheckboxProps extends Omit<MuiCheckboxProps, 'indeterminate'> {
  /**
   * 체크박스의 id (각 체크박스를 구분하기 위한 고유 식별자)
   */
  id: string;
  /**
   * 체크박스가 비활성화되었는지 여부
   */
  disabled?: boolean;
  /**
   * 체크박스의 중간 상태 여부 (일부 선택)
   */
  indeterminate?: boolean;
  /**
   * 체크박스 상태가 변경될 때 호출되는 함수
   * @param event 체크박스 변경 이벤트
   */
  onChange?: (event: React.ChangeEvent<HTMLInputElement>) => void;
}

// 커스텀 스타일드 체크박스
const StyledCheckbox = styled(MuiCheckbox)({
  padding: 0, // ✅ 패딩 제거
  color: 'var(--color-grey-25)',
  '&.Mui-checked': {
    color: 'var(--color-info)',
  },
  '&.Mui-indeterminate': {
    color: 'var(--color-info)',
  },
  '&.Mui-disabled': {
    color: 'var(--color-grey)',
  },
  '&.Mui-disabled.Mui-checked, &.Mui-disabled.Mui-indeterminate': {
    color: 'var(--color-grey)',
  },
  '& .MuiSvgIcon-root': {
    fontSize: '1.2rem',
  },
});

const Checkbox = ({
  id,
  disabled = false,
  indeterminate = false,
  className = '',
  onChange,
  ...props
}: CheckboxProps) => {
  return (
    <StyledCheckbox
      id={id}
      disabled={disabled}
      indeterminate={indeterminate}
      className={className}
      size='small'
      onChange={onChange}
      {...props}
    />
  );
};

export default Checkbox;
